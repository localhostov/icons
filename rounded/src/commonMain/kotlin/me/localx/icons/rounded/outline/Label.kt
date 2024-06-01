package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4572f, 4.555f)
                    lineTo(12.4862f, 0.126f)
                    curveTo(12.3375f, 0.0434f, 12.1702f, 0.0f, 12.0002f, 0.0f)
                    curveTo(11.8301f, 0.0f, 11.6628f, 0.0434f, 11.5142f, 0.126f)
                    lineTo(3.5431f, 4.555f)
                    curveTo(3.0756f, 4.8148f, 2.6859f, 5.1949f, 2.4146f, 5.6559f)
                    curveTo(2.1433f, 6.117f, 2.0002f, 6.6421f, 2.0001f, 7.177f)
                    verticalLineTo(19.0f)
                    curveTo(2.0017f, 20.3256f, 2.529f, 21.5965f, 3.4664f, 22.5338f)
                    curveTo(4.4037f, 23.4712f, 5.6746f, 23.9985f, 7.0002f, 24.0f)
                    horizontalLineTo(17.0002f)
                    curveTo(18.3257f, 23.9985f, 19.5966f, 23.4712f, 20.5339f, 22.5338f)
                    curveTo(21.4713f, 21.5965f, 21.9986f, 20.3256f, 22.0002f, 19.0f)
                    verticalLineTo(7.177f)
                    curveTo(22.0001f, 6.6421f, 21.857f, 6.117f, 21.5857f, 5.6559f)
                    curveTo(21.3144f, 5.1949f, 20.9247f, 4.8148f, 20.4572f, 4.555f)
                    close()
                    moveTo(20.0002f, 19.0f)
                    curveTo(20.0002f, 19.7957f, 19.6841f, 20.5588f, 19.1215f, 21.1214f)
                    curveTo(18.5589f, 21.684f, 17.7958f, 22.0f, 17.0002f, 22.0f)
                    horizontalLineTo(7.0002f)
                    curveTo(6.2045f, 22.0f, 5.4414f, 21.684f, 4.8788f, 21.1214f)
                    curveTo(4.3162f, 20.5588f, 4.0002f, 19.7957f, 4.0002f, 19.0f)
                    verticalLineTo(7.177f)
                    curveTo(3.9997f, 6.9982f, 4.0473f, 6.8224f, 4.1378f, 6.6682f)
                    curveTo(4.2284f, 6.5139f, 4.3587f, 6.3868f, 4.5152f, 6.3f)
                    lineTo(12.0002f, 2.144f)
                    lineTo(19.4862f, 6.3f)
                    curveTo(19.6424f, 6.3869f, 19.7725f, 6.5141f, 19.8629f, 6.6684f)
                    curveTo(19.9533f, 6.8226f, 20.0007f, 6.9983f, 20.0002f, 7.177f)
                    verticalLineTo(19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 8.5002f)
                    curveTo(12.8284f, 8.5002f, 13.5f, 7.8287f, 13.5f, 7.0002f)
                    curveTo(13.5f, 6.1718f, 12.8284f, 5.5002f, 12.0f, 5.5002f)
                    curveTo(11.1716f, 5.5002f, 10.5f, 6.1718f, 10.5f, 7.0002f)
                    curveTo(10.5f, 7.8287f, 11.1716f, 8.5002f, 12.0f, 8.5002f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null

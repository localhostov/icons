package me.localx.icons.rounded.filled

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

public val Icons.Filled.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = Builder(name = "SignOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.8308f, 9.1711f)
                    lineTo(18.9518f, 5.2921f)
                    curveTo(18.5545f, 4.9084f, 17.9215f, 4.9195f, 17.5378f, 5.3167f)
                    curveTo(17.1635f, 5.7042f, 17.1635f, 6.3186f, 17.5378f, 6.7061f)
                    lineTo(21.4168f, 10.5851f)
                    curveTo(21.5321f, 10.7027f, 21.6328f, 10.8336f, 21.7168f, 10.9751f)
                    curveTo(21.7018f, 10.9751f, 21.6898f, 10.9671f, 21.6748f, 10.9671f)
                    lineTo(5.9908f, 10.9991f)
                    curveTo(5.4385f, 10.9991f, 4.9908f, 11.4468f, 4.9908f, 11.9991f)
                    curveTo(4.9908f, 12.5514f, 5.4385f, 12.9991f, 5.9908f, 12.9991f)
                    lineTo(21.6688f, 12.9671f)
                    curveTo(21.6968f, 12.9671f, 21.7198f, 12.9531f, 21.7468f, 12.9511f)
                    curveTo(21.6581f, 13.1203f, 21.5456f, 13.2759f, 21.4128f, 13.4131f)
                    lineTo(17.5338f, 17.2921f)
                    curveTo(17.1366f, 17.6758f, 17.1256f, 18.3088f, 17.5092f, 18.7061f)
                    curveTo(17.8929f, 19.1034f, 18.526f, 19.1144f, 18.9232f, 18.7307f)
                    curveTo(18.9316f, 18.7226f, 18.9398f, 18.7144f, 18.9478f, 18.7061f)
                    lineTo(22.8268f, 14.8271f)
                    curveTo(24.3884f, 13.2651f, 24.3884f, 10.7331f, 22.8268f, 9.1711f)
                    horizontalLineTo(22.8308f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0019f, 22.0f)
                    horizontalLineTo(5.0019f)
                    curveTo(3.345f, 22.0f, 2.0019f, 20.6568f, 2.0019f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(2.0019f, 3.3432f, 3.345f, 2.0f, 5.0019f, 2.0f)
                    horizontalLineTo(7.0019f)
                    curveTo(7.5542f, 2.0f, 8.0019f, 1.5523f, 8.0019f, 1.0f)
                    curveTo(8.0019f, 0.4478f, 7.5542f, 0.0f, 7.0019f, 0.0f)
                    horizontalLineTo(5.0019f)
                    curveTo(2.2419f, 0.0033f, 0.0052f, 2.24f, 0.0019f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0052f, 21.76f, 2.2419f, 23.9967f, 5.0019f, 24.0f)
                    horizontalLineTo(7.0019f)
                    curveTo(7.5542f, 24.0f, 8.0019f, 23.5523f, 8.0019f, 23.0f)
                    curveTo(8.0019f, 22.4477f, 7.5542f, 22.0f, 7.0019f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _signOut!!
    }

private var _signOut: ImageVector? = null

package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 13.9996f)
                    curveTo(11.2044f, 13.9996f, 10.4413f, 14.3157f, 9.8787f, 14.8783f)
                    curveTo(9.3161f, 15.4409f, 9.0f, 16.204f, 9.0f, 16.9996f)
                    verticalLineTo(24.0256f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(16.9996f)
                    curveTo(15.0f, 16.204f, 14.6839f, 15.4409f, 14.1213f, 14.8783f)
                    curveTo(13.5587f, 14.3157f, 12.7956f, 13.9996f, 12.0f, 13.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.338f, 0.8331f)
                    curveTo(12.9707f, 0.5025f, 12.4941f, 0.3196f, 12.0f, 0.3196f)
                    curveTo(11.5059f, 0.3196f, 11.0293f, 0.5025f, 10.662f, 0.8331f)
                    lineTo(0.0f, 10.4291f)
                    verticalLineTo(20.8291f)
                    curveTo(0.0f, 21.6778f, 0.3371f, 22.4917f, 0.9373f, 23.0918f)
                    curveTo(1.5374f, 23.6919f, 2.3513f, 24.0291f, 3.2f, 24.0291f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.0001f)
                    curveTo(7.0f, 15.674f, 7.5268f, 14.4022f, 8.4645f, 13.4645f)
                    curveTo(9.4022f, 12.5268f, 10.6739f, 12.0001f, 12.0f, 12.0001f)
                    curveTo(13.3261f, 12.0001f, 14.5979f, 12.5268f, 15.5355f, 13.4645f)
                    curveTo(16.4732f, 14.4022f, 17.0f, 15.674f, 17.0f, 17.0001f)
                    verticalLineTo(24.0261f)
                    horizontalLineTo(20.8f)
                    curveTo(21.6487f, 24.0261f, 22.4626f, 23.6889f, 23.0627f, 23.0888f)
                    curveTo(23.6629f, 22.4887f, 24.0f, 21.6748f, 24.0f, 20.8261f)
                    verticalLineTo(10.4261f)
                    lineTo(13.338f, 0.8331f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null

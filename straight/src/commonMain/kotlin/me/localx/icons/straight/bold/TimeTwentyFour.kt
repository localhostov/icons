package me.localx.icons.straight.bold

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TimeTwentyFour: ImageVector
    get() {
        if (_timeTwentyFour != null) {
            return _timeTwentyFour!!
        }
        _timeTwentyFour = Builder(name = "TimeTwentyFour", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.625f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.375f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                curveToRelative(0.0f, 0.625f, -1.192f, 1.519f, -2.15f, 2.237f)
                curveTo(8.28f, 19.04f, 6.5f, 20.375f, 6.5f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.7f)
                curveToRelative(0.31f, -0.254f, 0.645f, -0.5f, 0.955f, -0.737f)
                curveTo(13.22f, 19.085f, 15.0f, 17.75f, 15.0f, 15.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(1.252f, 1.252f, 0.0f, false, true, 19.0f, 15.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(3.75f)
                arcTo(4.255f, 4.255f, 0.0f, false, false, 20.25f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.471f, 3.529f)
                arcTo(11.978f, 11.978f, 0.0f, false, false, 1.831f, 18.341f)
                lineToRelative(2.192f, -2.193f)
                arcTo(8.984f, 8.984f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(9.023f, 9.023f, 0.0f, false, true, 6.353f, 2.647f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(5.909f)
                arcTo(1.09f, 1.09f, 0.0f, false, false, 23.0f, 6.909f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _timeTwentyFour!!
    }

private var _timeTwentyFour: ImageVector? = null

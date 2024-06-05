package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

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
                moveToRelative(15.0f, 15.625f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                curveToRelative(0.0f, 0.625f, -1.192f, 1.519f, -2.15f, 2.237f)
                curveToRelative(-1.57f, 1.178f, -3.35f, 2.513f, -3.35f, 4.638f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(0.31f, -0.254f, 0.645f, -0.5f, 0.955f, -0.737f)
                curveToRelative(1.565f, -1.178f, 3.345f, -2.513f, 3.345f, -4.638f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(1.252f, 1.252f, 0.0f, false, true, -1.25f, -1.25f)
                verticalLineToRelative(-3.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.25f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, false, 4.25f, 4.25f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.293f, 2.707f)
                lineToRelative(-1.323f, 1.323f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.47f, 13.781f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.624f, -1.455f)
                arcToRelative(8.992f, 8.992f, 0.0f, false, true, 14.71f, -10.19f)
                lineToRelative(-1.127f, 1.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 1.707f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, -0.707f)
                close()
            }
        }
        .build()
        return _timeTwentyFour!!
    }

private var _timeTwentyFour: ImageVector? = null

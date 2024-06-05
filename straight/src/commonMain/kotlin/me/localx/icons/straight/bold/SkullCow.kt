package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.SkullCow: ImageVector
    get() {
        if (_skullCow != null) {
            return _skullCow!!
        }
        _skullCow = Builder(name = "SkullCow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.653f, 4.957f)
                lineToRelative(2.082f, 5.52f)
                curveToRelative(0.759f, 2.165f, -0.202f, 4.535f, -2.223f, 5.546f)
                lineToRelative(-1.722f, 0.614f)
                lineToRelative(-1.577f, 7.362f)
                lineTo(7.788f, 23.999f)
                lineToRelative(-1.578f, -7.362f)
                lineToRelative(-1.723f, -0.614f)
                curveToRelative(-2.02f, -1.011f, -2.98f, -3.381f, -2.234f, -5.513f)
                lineToRelative(2.094f, -5.553f)
                curveTo(1.898f, 4.637f, 0.0f, 2.536f, 0.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.536f, -1.898f, 4.637f, -4.347f, 4.957f)
                close()
                moveTo(18.915f, 11.501f)
                lineToRelative(-2.452f, -6.502f)
                lineTo(7.537f, 4.999f)
                lineToRelative(-2.465f, 6.536f)
                curveToRelative(-0.228f, 0.653f, 0.062f, 1.411f, 0.688f, 1.767f)
                lineToRelative(3.03f, 1.06f)
                lineToRelative(1.422f, 6.638f)
                horizontalLineToRelative(3.575f)
                lineToRelative(1.423f, -6.638f)
                lineToRelative(3.03f, -1.06f)
                curveToRelative(0.625f, -0.355f, 0.915f, -1.115f, 0.675f, -1.801f)
                close()
            }
        }
        .build()
        return _skullCow!!
    }

private var _skullCow: ImageVector? = null

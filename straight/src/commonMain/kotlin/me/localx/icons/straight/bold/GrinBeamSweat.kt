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

public val Icons.Bold.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcToRelative(21.923f, 21.923f, 0.0f, false, false, 6.007f, -1.0f)
                curveToRelative(-0.615f, 2.28f, -2.664f, 5.0f, -6.0f, 5.0f)
                reflectiveCurveTo(6.615f, 16.28f, 6.0f, 14.0f)
                close()
                moveTo(20.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.0f, 4.5f)
                curveTo(23.0f, 2.462f, 20.5f, 0.0f, 20.5f, 0.0f)
                reflectiveCurveTo(18.0f, 2.513f, 18.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 7.0f)
                close()
                moveTo(23.3f, 8.0f)
                arcToRelative(4.419f, 4.419f, 0.0f, false, true, -2.824f, 1.0f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 3.0f, 12.0f)
                curveTo(2.836f, 5.457f, 10.3f, 0.893f, 16.034f, 3.966f)
                arcToRelative(7.386f, 7.386f, 0.0f, false, true, 1.055f, -2.818f)
                curveTo(9.451f, -2.676f, -0.206f, 3.408f, 0.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 24.0f)
                curveTo(20.118f, 24.156f, 26.164f, 15.565f, 23.3f, 8.0f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(-2.267f, 0.0f, -3.0f, 3.369f, -3.0f, 5.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(11.0f, 10.369f, 10.267f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(2.759f, -2.607f, 3.254f, -2.59f, 6.0f, 0.0f)
                curveTo(18.829f, 5.339f, 13.167f, 5.354f, 13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null

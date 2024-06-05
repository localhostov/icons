package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6f, 5.235f)
                curveTo(22.74f, 2.682f, 22.513f, -0.173f, 18.74f, 0.0f)
                arcToRelative(7.159f, 7.159f, 0.0f, false, false, -6.191f, 3.439f)
                arcTo(4.657f, 4.657f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 2.0f)
                curveToRelative(1.915f, 0.0f, 2.605f, 1.621f, 2.855f, 2.8f)
                arcTo(7.536f, 7.536f, 0.0f, false, false, 0.0f, 11.5f)
                curveTo(0.0f, 19.588f, 7.927f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -4.412f, 12.0f, -12.5f)
                arcTo(7.471f, 7.471f, 0.0f, false, false, 20.6f, 5.235f)
                close()
                moveTo(18.74f, 2.0f)
                arcToRelative(5.958f, 5.958f, 0.0f, false, true, 1.233f, 0.125f)
                curveToRelative(-0.659f, 2.694f, -3.12f, 4.0f, -6.48f, 3.865f)
                arcTo(5.573f, 5.573f, 0.0f, false, true, 18.74f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(9.01f, 22.0f, 2.0f, 18.428f, 2.0f, 11.5f)
                curveToRelative(0.232f, -7.268f, 10.769f, -7.268f, 11.0f, 0.0f)
                arcToRelative(12.252f, 12.252f, 0.0f, false, true, -1.833f, 5.946f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.665f, 1.109f)
                curveToRelative(0.792f, -0.88f, 3.532f, -7.093f, 1.293f, -10.563f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 4.928f, -1.349f)
                arcTo(5.477f, 5.477f, 0.0f, false, true, 22.0f, 11.5f)
                curveTo(22.0f, 18.428f, 14.99f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null

package me.localx.icons.straight.outline

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

public val Icons.Outline.Paste: ImageVector
    get() {
        if (_paste != null) {
            return _paste!!
        }
        _paste = Builder(name = "Paste", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2.0f, -2.83f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.3f, 0.0f, -2.42f, 0.84f, -2.83f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.35f, 2.0f, 0.0f, 3.35f, 0.0f, 5.0f)
                lineTo(0.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(13.0f)
                lineTo(24.0f, 12.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _paste!!
    }

private var _paste: ImageVector? = null

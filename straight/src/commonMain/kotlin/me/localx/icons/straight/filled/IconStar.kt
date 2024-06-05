package me.localx.icons.straight.filled

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

public val Icons.Filled.IconStar: ImageVector
    get() {
        if (_iconStar != null) {
            return _iconStar!!
        }
        _iconStar = Builder(name = "IconStar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(7.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(12.02f, 14.86f)
                lineToRelative(3.26f, 2.52f)
                lineToRelative(0.75f, -0.52f)
                lineToRelative(-1.33f, -4.03f)
                lineToRelative(3.3f, -1.91f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-1.18f, -4.5f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.18f, 4.5f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.32f, 1.85f)
                lineToRelative(-1.3f, 4.08f)
                lineToRelative(0.72f, 0.54f)
                lineToRelative(3.27f, -2.53f)
                close()
            }
        }
        .build()
        return _iconStar!!
    }

private var _iconStar: ImageVector? = null

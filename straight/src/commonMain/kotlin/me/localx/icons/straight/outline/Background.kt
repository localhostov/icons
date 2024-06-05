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

public val Icons.Outline.Background: ImageVector
    get() {
        if (_background != null) {
            return _background!!
        }
        _background = Builder(name = "Background", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 14.59f)
                lineToRelative(-7.41f, 7.41f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(11.59f, -11.59f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(2.0f, 9.41f)
                lineTo(9.41f, 2.0f)
                horizontalLineToRelative(4.17f)
                lineTo(2.0f, 13.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(2.0f, 16.41f)
                lineTo(16.41f, 2.0f)
                horizontalLineToRelative(4.17f)
                lineTo(2.0f, 20.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(22.0f, 3.41f)
                lineTo(22.0f, 7.59f)
                lineTo(7.59f, 22.0f)
                lineTo(3.41f, 22.0f)
                lineTo(22.0f, 3.41f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(3.59f)
                lineTo(2.0f, 6.59f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(17.41f, 22.0f)
                lineToRelative(4.59f, -4.59f)
                verticalLineToRelative(4.59f)
                horizontalLineToRelative(-4.59f)
                close()
            }
        }
        .build()
        return _background!!
    }

private var _background: ImageVector? = null
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

public val Icons.Outline.ArrowsAltV: ImageVector
    get() {
        if (_arrowsAltV != null) {
            return _arrowsAltV!!
        }
        _arrowsAltV = Builder(name = "ArrowsAltV", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.913f, 19.35f)
                lineToRelative(-4.361f, 4.418f)
                curveToRelative(-0.305f, 0.309f, -0.799f, 0.309f, -1.104f, 0.0f)
                lineToRelative(-4.361f, -4.418f)
                curveToRelative(-0.492f, -0.498f, -0.143f, -1.35f, 0.552f, -1.35f)
                horizontalLineToRelative(3.361f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-3.361f)
                curveToRelative(-0.695f, 0.0f, -1.044f, -0.852f, -0.552f, -1.35f)
                lineTo(11.448f, 0.232f)
                curveToRelative(0.305f, -0.309f, 0.799f, -0.309f, 1.104f, 0.0f)
                lineToRelative(4.361f, 4.418f)
                curveToRelative(0.492f, 0.498f, 0.143f, 1.35f, -0.552f, 1.35f)
                horizontalLineToRelative(-3.361f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.361f)
                curveToRelative(0.695f, 0.0f, 1.044f, 0.852f, 0.552f, 1.35f)
                close()
            }
        }
        .build()
        return _arrowsAltV!!
    }

private var _arrowsAltV: ImageVector? = null

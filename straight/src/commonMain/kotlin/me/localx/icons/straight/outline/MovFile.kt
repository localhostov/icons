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

public val Icons.Outline.MovFile: ImageVector
    get() {
        if (_movFile != null) {
            return _movFile!!
        }
        _movFile = Builder(name = "MovFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.414f)
                lineToRelative(5.586f, -5.586f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(18.0f, 21.586f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, 3.586f)
                close()
                moveTo(16.745f, 11.033f)
                lineToRelative(-1.511f, -6.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(0.826f, 3.282f)
                lineToRelative(0.684f, -3.282f)
                horizontalLineToRelative(1.252f)
                lineToRelative(-1.252f, 6.0f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(12.5f, 5.003f)
                curveToRelative(-1.086f, 0.0f, -2.0f, 0.877f, -2.0f, 1.964f)
                verticalLineToRelative(2.066f)
                curveToRelative(0.0f, 1.086f, 0.914f, 1.967f, 2.0f, 1.967f)
                reflectiveCurveToRelative(2.0f, -0.881f, 2.0f, -1.967f)
                verticalLineToRelative(-2.066f)
                curveToRelative(0.0f, -1.086f, -0.914f, -1.964f, -2.0f, -1.964f)
                close()
                moveTo(13.246f, 9.012f)
                curveToRelative(0.001f, 0.403f, -0.322f, 0.729f, -0.724f, 0.736f)
                curveToRelative(-0.402f, -0.007f, -0.768f, -0.333f, -0.767f, -0.736f)
                curveToRelative(0.0f, -0.048f, 0.0f, -1.976f, 0.0f, -2.024f)
                curveToRelative(-0.001f, -0.403f, 0.344f, -0.725f, 0.746f, -0.731f)
                curveToRelative(0.402f, 0.007f, 0.747f, 0.328f, 0.746f, 0.731f)
                curveToRelative(0.0f, 0.048f, 0.0f, 1.976f, 0.0f, 2.024f)
                close()
                moveTo(8.926f, 5.759f)
                lineToRelative(0.385f, 5.31f)
                horizontalLineToRelative(-1.217f)
                lineToRelative(-0.242f, -3.339f)
                lineToRelative(-1.196f, 2.631f)
                lineToRelative(-1.196f, -2.631f)
                lineToRelative(-0.242f, 3.339f)
                horizontalLineToRelative(-1.217f)
                lineToRelative(0.385f, -5.31f)
                curveToRelative(0.032f, -0.535f, 0.358f, -0.759f, 0.749f, -0.759f)
                curveToRelative(0.26f, 0.0f, 0.501f, 0.184f, 0.638f, 0.486f)
                lineToRelative(0.883f, 1.942f)
                lineToRelative(0.883f, -1.942f)
                curveToRelative(0.137f, -0.302f, 0.378f, -0.486f, 0.638f, -0.486f)
                curveToRelative(0.391f, 0.0f, 0.717f, 0.224f, 0.749f, 0.759f)
                close()
            }
        }
        .build()
        return _movFile!!
    }

private var _movFile: ImageVector? = null

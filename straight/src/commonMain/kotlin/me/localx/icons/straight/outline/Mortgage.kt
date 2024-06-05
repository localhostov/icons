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

public val Icons.Outline.Mortgage: ImageVector
    get() {
        if (_mortgage != null) {
            return _mortgage!!
        }
        _mortgage = Builder(name = "Mortgage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.812f, 7.635f)
                lineToRelative(-0.812f, -0.637f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.432f)
                lineTo(13.908f, 0.659f)
                curveToRelative(-1.124f, -0.881f, -2.693f, -0.881f, -3.815f, 0.0f)
                lineTo(1.188f, 7.635f)
                curveToRelative(-0.755f, 0.591f, -1.188f, 1.48f, -1.188f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.959f, -0.433f, -1.849f, -1.188f, -2.439f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.34f, 0.153f, -0.655f, 0.421f, -0.865f)
                lineTo(11.326f, 2.233f)
                curveToRelative(0.397f, -0.312f, 0.951f, -0.311f, 1.349f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.267f, 0.209f, 0.42f, 0.524f, 0.42f, 0.864f)
                verticalLineToRelative(11.926f)
                close()
                moveTo(17.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.154f, 10.0f)
                lineToRelative(-5.833f, 9.0f)
                horizontalLineToRelative(-2.474f)
                lineToRelative(5.833f, -9.0f)
                horizontalLineToRelative(2.474f)
                close()
            }
        }
        .build()
        return _mortgage!!
    }

private var _mortgage: ImageVector? = null

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

public val Icons.Outline.OctagonExclamation: ImageVector
    get() {
        if (_octagonExclamation != null) {
            return _octagonExclamation!!
        }
        _octagonExclamation = Builder(name = "OctagonExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.242f, 5.272f)
                lineToRelative(-3.515f, -3.515f)
                curveToRelative(-1.133f, -1.133f, -2.64f, -1.757f, -4.242f, -1.757f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.603f, 0.0f, -3.109f, 0.624f, -4.242f, 1.757f)
                lineToRelative(-3.515f, 3.514f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                verticalLineToRelative(4.971f)
                curveToRelative(0.0f, 1.603f, 0.624f, 3.11f, 1.758f, 4.243f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(1.133f, 1.133f, 2.64f, 1.757f, 4.242f, 1.757f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.603f, 0.0f, 3.109f, -0.624f, 4.242f, -1.757f)
                lineToRelative(3.515f, -3.514f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.603f, -0.624f, -3.11f, -1.758f, -4.243f)
                close()
                moveTo(22.0f, 14.485f)
                curveToRelative(0.0f, 1.069f, -0.416f, 2.073f, -1.172f, 2.829f)
                lineToRelative(-3.515f, 3.515f)
                curveToRelative(-0.756f, 0.755f, -1.76f, 1.171f, -2.828f, 1.171f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.068f, 0.0f, -2.072f, -0.416f, -2.828f, -1.171f)
                lineToRelative(-3.515f, -3.515f)
                curveToRelative(-0.756f, -0.755f, -1.172f, -1.759f, -1.172f, -2.828f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.069f, 0.416f, -2.073f, 1.172f, -2.829f)
                lineToRelative(3.515f, -3.515f)
                curveToRelative(0.756f, -0.755f, 1.76f, -1.171f, 2.828f, -1.171f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.068f, 0.0f, 2.072f, 0.416f, 2.828f, 1.171f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(0.756f, 0.755f, 1.172f, 1.759f, 1.172f, 2.828f)
                verticalLineToRelative(4.971f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(11.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _octagonExclamation!!
    }

private var _octagonExclamation: ImageVector? = null

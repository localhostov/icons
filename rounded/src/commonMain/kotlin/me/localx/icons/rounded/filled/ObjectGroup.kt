package me.localx.icons.rounded.filled

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

public val Icons.Filled.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.306f, 0.0f, -2.416f, -0.835f, -2.828f, -2.0f)
                lineTo(5.828f, 22.0f)
                curveToRelative(-0.412f, 1.165f, -1.522f, 2.0f, -2.828f, 2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.306f, 0.835f, -2.416f, 2.0f, -2.828f)
                lineTo(2.0f, 5.828f)
                curveToRelative(-1.165f, -0.412f, -2.0f, -1.522f, -2.0f, -2.828f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                curveToRelative(1.306f, 0.0f, 2.416f, 0.835f, 2.828f, 2.0f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.412f, -1.165f, 1.522f, -2.0f, 2.828f, -2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.306f, -0.835f, 2.416f, -2.0f, 2.828f)
                verticalLineToRelative(12.344f)
                curveToRelative(1.165f, 0.412f, 2.0f, 1.522f, 2.0f, 2.828f)
                close()
                moveTo(3.987f, 18.167f)
                reflectiveCurveToRelative(0.0f, -0.004f, -0.002f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, 0.0f)
                close()
                moveTo(20.0f, 5.828f)
                curveToRelative(-0.852f, -0.301f, -1.527f, -0.976f, -1.828f, -1.828f)
                lineTo(5.828f, 4.0f)
                curveToRelative(-0.301f, 0.852f, -0.976f, 1.527f, -1.828f, 1.828f)
                verticalLineToRelative(12.344f)
                curveToRelative(0.852f, 0.301f, 1.527f, 0.976f, 1.828f, 1.828f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.301f, -0.852f, 0.976f, -1.527f, 1.828f, -1.828f)
                lineTo(20.0f, 5.828f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null

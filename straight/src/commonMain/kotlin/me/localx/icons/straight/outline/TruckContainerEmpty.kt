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

public val Icons.Outline.TruckContainerEmpty: ImageVector
    get() {
        if (_truckContainerEmpty != null) {
            return _truckContainerEmpty!!
        }
        _truckContainerEmpty = Builder(name = "TruckContainerEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.7f)
                curveToRelative(0.0f, -0.537f, -0.086f, -1.069f, -0.256f, -1.581f)
                lineToRelative(-1.339f, -4.017f)
                curveToRelative(-0.41f, -1.227f, -1.553f, -2.051f, -2.846f, -2.051f)
                horizontalLineToRelative(-3.559f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 17.051f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.98f, 0.0f, 1.864f, -0.407f, 2.5f, -1.058f)
                curveToRelative(0.636f, 0.651f, 1.52f, 1.058f, 2.5f, 1.058f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.352f)
                close()
                moveTo(18.0f, 17.052f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.559f, 7.052f)
                curveToRelative(0.431f, 0.0f, 0.812f, 0.274f, 0.949f, 0.684f)
                lineToRelative(1.106f, 3.316f)
                horizontalLineToRelative(-3.613f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.559f)
                close()
                moveTo(3.5f, 21.052f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.0f, 19.552f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.0f, 19.552f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _truckContainerEmpty!!
    }

private var _truckContainerEmpty: ImageVector? = null

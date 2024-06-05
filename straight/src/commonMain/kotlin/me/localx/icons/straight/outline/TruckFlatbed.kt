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

public val Icons.Outline.TruckFlatbed: ImageVector
    get() {
        if (_truckFlatbed != null) {
            return _truckFlatbed!!
        }
        _truckFlatbed = Builder(name = "TruckFlatbed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.052f)
                curveToRelative(0.0f, -1.635f, -1.316f, -2.964f, -2.945f, -2.994f)
                lineToRelative(-1.651f, -4.955f)
                curveToRelative(-0.409f, -1.227f, -1.553f, -2.051f, -2.846f, -2.051f)
                horizontalLineToRelative(-4.559f)
                verticalLineToRelative(13.0f)
                lineTo(0.0f, 17.052f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.041f)
                curveToRelative(-0.024f, 0.165f, -0.041f, 0.331f, -0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.017f, -0.335f, -0.041f, -0.5f)
                horizontalLineToRelative(6.082f)
                curveToRelative(-0.024f, 0.165f, -0.041f, 0.331f, -0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, -0.017f, -0.335f, -0.041f, -0.5f)
                horizontalLineToRelative(2.041f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.559f, 6.052f)
                curveToRelative(0.431f, 0.0f, 0.812f, 0.274f, 0.949f, 0.684f)
                lineToRelative(1.438f, 4.316f)
                horizontalLineToRelative(-4.946f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.559f)
                close()
                moveTo(7.0f, 19.552f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.19f, 0.039f, -0.356f, 0.093f, -0.5f)
                horizontalLineToRelative(2.815f)
                curveToRelative(0.054f, 0.144f, 0.093f, 0.31f, 0.093f, 0.5f)
                close()
                moveTo(20.0f, 19.552f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.19f, 0.039f, -0.356f, 0.093f, -0.5f)
                horizontalLineToRelative(2.815f)
                curveToRelative(0.054f, 0.144f, 0.093f, 0.31f, 0.093f, 0.5f)
                close()
                moveTo(22.0f, 17.052f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _truckFlatbed!!
    }

private var _truckFlatbed: ImageVector? = null

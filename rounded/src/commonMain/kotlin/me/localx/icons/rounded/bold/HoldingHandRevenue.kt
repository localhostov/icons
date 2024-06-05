package me.localx.icons.rounded.bold

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

public val Icons.Bold.HoldingHandRevenue: ImageVector
    get() {
        if (_holdingHandRevenue != null) {
            return _holdingHandRevenue!!
        }
        _holdingHandRevenue = Builder(name = "HoldingHandRevenue", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 7.5f)
                lineTo(7.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(15.0f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23.014f, 14.468f)
                lineToRelative(-5.195f, 5.943f)
                curveToRelative(-1.994f, 2.281f, -4.875f, 3.589f, -7.905f, 3.589f)
                horizontalLineToRelative(-5.414f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.858f)
                curveToRelative(0.942f, 0.0f, 1.802f, 0.36f, 2.45f, 0.949f)
                lineToRelative(2.438f, -2.68f)
                curveToRelative(0.698f, -0.767f, 1.654f, -1.217f, 2.69f, -1.265f)
                curveToRelative(1.037f, -0.05f, 2.029f, 0.31f, 2.796f, 1.008f)
                curveToRelative(1.566f, 1.427f, 1.692f, 3.875f, 0.282f, 5.455f)
                close()
                moveTo(20.712f, 11.23f)
                curveToRelative(-0.175f, -0.159f, -0.402f, -0.242f, -0.636f, -0.229f)
                curveToRelative(-0.236f, 0.011f, -0.453f, 0.113f, -0.612f, 0.288f)
                lineToRelative(-3.498f, 3.844f)
                curveToRelative(-0.218f, 1.584f, -1.475f, 2.883f, -3.093f, 3.115f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.819f, 0.112f, -1.58f, -0.453f, -1.697f, -1.273f)
                curveToRelative(-0.117f, -0.82f, 0.453f, -1.58f, 1.273f, -1.697f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.314f, -0.045f, 0.551f, -0.318f, 0.551f, -0.636f)
                curveToRelative(0.0f, -0.354f, -0.288f, -0.642f, -0.642f, -0.642f)
                horizontalLineToRelative(-7.858f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.414f)
                curveToRelative(2.164f, 0.0f, 4.222f, -0.935f, 5.646f, -2.563f)
                lineToRelative(5.206f, -5.955f)
                curveToRelative(0.331f, -0.371f, 0.302f, -0.927f, -0.054f, -1.252f)
                close()
            }
        }
        .build()
        return _holdingHandRevenue!!
    }

private var _holdingHandRevenue: ImageVector? = null

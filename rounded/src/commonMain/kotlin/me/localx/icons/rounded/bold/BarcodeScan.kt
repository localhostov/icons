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

public val Icons.Bold.BarcodeScan: ImageVector
    get() {
        if (_barcodeScan != null) {
            return _barcodeScan!!
        }
        _barcodeScan = Builder(name = "BarcodeScan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 12.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                lineTo(2.0f, 2.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                curveToRelative(0.0f, -1.104f, 0.896f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.896f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 2.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -1.104f, 0.896f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.896f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(3.5f, 14.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 14.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(-1.104f, 0.0f, -2.0f, 0.896f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.104f, 0.896f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.896f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.104f, -0.896f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveToRelative(-1.104f, 0.0f, -2.0f, 0.896f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.104f, 0.896f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.896f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.104f, -0.896f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _barcodeScan!!
    }

private var _barcodeScan: ImageVector? = null

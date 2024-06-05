package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.BookTanakh: ImageVector
    get() {
        if (_bookTanakh != null) {
            return _bookTanakh!!
        }
        _bookTanakh = Builder(name = "BookTanakh", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.039f, 0.0f)
                lineTo(4.039f, 0.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(22.039f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.039f, 2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.184f)
                curveToRelative(-0.314f, -0.112f, -0.648f, -0.184f, -1.0f, -0.184f)
                lineTo(4.039f, 18.0f)
                lineTo(4.039f, 2.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(19.039f, 22.0f)
                lineTo(4.039f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.758f, 9.993f)
                lineToRelative(-2.133f, 3.502f)
                horizontalLineToRelative(4.268f)
                lineToRelative(2.107f, 3.455f)
                lineToRelative(2.107f, -3.455f)
                horizontalLineToRelative(4.268f)
                lineToRelative(-2.133f, -3.502f)
                lineToRelative(2.133f, -3.498f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(-2.112f, -3.467f)
                lineToRelative(-2.112f, 3.467f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(2.133f, 3.498f)
                close()
                moveTo(7.406f, 12.495f)
                lineToRelative(0.938f, -1.541f)
                lineToRelative(0.94f, 1.541f)
                horizontalLineToRelative(-1.878f)
                close()
                moveTo(8.93f, 9.993f)
                lineToRelative(1.521f, -2.498f)
                horizontalLineToRelative(3.099f)
                lineToRelative(1.521f, 2.498f)
                lineToRelative(-1.526f, 2.502f)
                horizontalLineToRelative(-3.091f)
                lineToRelative(-1.526f, -2.502f)
                close()
                moveTo(12.001f, 15.029f)
                lineToRelative(-0.936f, -1.534f)
                horizontalLineToRelative(1.871f)
                lineToRelative(-0.936f, 1.534f)
                close()
                moveTo(16.596f, 12.495f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.94f, -1.541f)
                lineToRelative(0.938f, 1.541f)
                close()
                moveTo(16.596f, 7.495f)
                lineToRelative(-0.937f, 1.537f)
                lineToRelative(-0.936f, -1.537f)
                horizontalLineToRelative(1.874f)
                close()
                moveTo(12.002f, 4.951f)
                lineToRelative(0.94f, 1.544f)
                horizontalLineToRelative(-1.881f)
                lineToRelative(0.94f, -1.544f)
                close()
                moveTo(8.345f, 9.032f)
                lineToRelative(-0.937f, -1.537f)
                horizontalLineToRelative(1.874f)
                lineToRelative(-0.936f, 1.537f)
                close()
            }
        }
        .build()
        return _bookTanakh!!
    }

private var _bookTanakh: ImageVector? = null

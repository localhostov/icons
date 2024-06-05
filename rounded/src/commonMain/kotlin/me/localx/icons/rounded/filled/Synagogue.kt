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

public val Icons.Filled.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.249f, 10.899f)
                curveToRelative(0.474f, 0.38f, 0.751f, 0.954f, 0.751f, 1.562f)
                verticalLineToRelative(11.539f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                verticalLineToRelative(-8.039f)
                curveToRelative(0.0f, -0.608f, 0.276f, -1.182f, 0.751f, -1.562f)
                lineToRelative(1.125f, -0.9f)
                curveToRelative(0.365f, -0.292f, 0.884f, -0.292f, 1.249f, 0.0f)
                lineToRelative(1.125f, 0.9f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(23.249f, 10.899f)
                lineToRelative(-1.125f, -0.9f)
                curveToRelative(-0.365f, -0.292f, -0.884f, -0.292f, -1.249f, 0.0f)
                lineToRelative(-1.125f, 0.9f)
                curveToRelative(-0.474f, 0.38f, -0.751f, 0.954f, -0.751f, 1.562f)
                verticalLineToRelative(11.539f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-8.039f)
                curveToRelative(0.0f, -0.608f, -0.276f, -1.182f, -0.751f, -1.562f)
                close()
                moveTo(17.0f, 4.75f)
                verticalLineToRelative(19.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.85f, -1.683f, -3.314f, -3.598f, -2.942f)
                curveToRelative(-1.424f, 0.277f, -2.402f, 1.609f, -2.402f, 3.06f)
                verticalLineToRelative(4.882f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 4.75f)
                curveToRelative(0.0f, -0.944f, 0.445f, -1.833f, 1.2f, -2.4f)
                lineToRelative(2.6f, -1.95f)
                curveToRelative(0.711f, -0.533f, 1.689f, -0.533f, 2.4f, 0.0f)
                lineToRelative(2.6f, 1.95f)
                curveToRelative(0.755f, 0.567f, 1.2f, 1.456f, 1.2f, 2.4f)
                close()
                moveTo(14.163f, 10.0f)
                lineToRelative(0.654f, -1.09f)
                curveToRelative(0.213f, -0.355f, -0.043f, -0.807f, -0.457f, -0.807f)
                horizontalLineToRelative(-1.336f)
                lineToRelative(-0.568f, -0.946f)
                curveToRelative(-0.207f, -0.345f, -0.707f, -0.345f, -0.914f, 0.0f)
                lineToRelative(-0.568f, 0.946f)
                horizontalLineToRelative(-1.336f)
                curveToRelative(-0.414f, 0.0f, -0.67f, 0.452f, -0.457f, 0.807f)
                lineToRelative(0.654f, 1.09f)
                lineToRelative(-0.654f, 1.09f)
                curveToRelative(-0.213f, 0.355f, 0.043f, 0.807f, 0.457f, 0.807f)
                horizontalLineToRelative(1.336f)
                lineToRelative(0.568f, 0.946f)
                curveToRelative(0.207f, 0.345f, 0.707f, 0.345f, 0.914f, 0.0f)
                lineToRelative(0.568f, -0.946f)
                horizontalLineToRelative(1.336f)
                curveToRelative(0.414f, 0.0f, 0.67f, -0.452f, 0.457f, -0.807f)
                lineToRelative(-0.654f, -1.09f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null

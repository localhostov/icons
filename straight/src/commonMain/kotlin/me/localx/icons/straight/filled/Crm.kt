package me.localx.icons.straight.filled

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

public val Icons.Filled.Crm: ImageVector
    get() {
        if (_crm != null) {
            return _crm!!
        }
        _crm = Builder(name = "Crm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.999f, 10.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveTo(-0.001f, 16.43f, -0.001f, 14.5f)
                verticalLineToRelative(-4.0f)
                curveTo(-0.001f, 8.57f, 1.569f, 7.0f, 3.499f, 7.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
                moveTo(13.284f, 13.131f)
                lineToRelative(1.217f, 4.869f)
                horizontalLineToRelative(-2.135f)
                lineToRelative(-1.008f, -4.036f)
                curveToRelative(-0.119f, 0.012f, -0.235f, 0.036f, -0.357f, 0.036f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.001f, 7.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.053f, -0.478f, 1.988f, -1.217f, 2.631f)
                close()
                moveTo(11.001f, 12.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.335f, 8.297f)
                curveToRelative(-0.053f, -0.914f, -0.586f, -1.297f, -1.225f, -1.297f)
                curveToRelative(-0.424f, 0.0f, -0.818f, 0.314f, -1.043f, 0.831f)
                lineToRelative(-1.434f, 2.887f)
                lineToRelative(-1.451f, -2.887f)
                curveToRelative(-0.224f, -0.517f, -0.619f, -0.831f, -1.043f, -0.831f)
                curveToRelative(-0.639f, 0.0f, -1.172f, 0.383f, -1.224f, 1.297f)
                lineToRelative(-0.672f, 9.703f)
                horizontalLineToRelative(2.005f)
                lineToRelative(0.461f, -6.656f)
                lineToRelative(0.137f, 0.272f)
                lineToRelative(1.797f, 3.577f)
                lineToRelative(1.781f, -3.585f)
                lineToRelative(0.115f, -0.231f)
                lineToRelative(0.449f, 6.623f)
                horizontalLineToRelative(2.005f)
                lineToRelative(-0.658f, -9.703f)
                close()
            }
        }
        .build()
        return _crm!!
    }

private var _crm: ImageVector? = null

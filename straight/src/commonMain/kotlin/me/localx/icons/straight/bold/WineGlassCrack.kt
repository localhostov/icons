package me.localx.icons.straight.bold

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

public val Icons.Bold.WineGlassCrack: ImageVector
    get() {
        if (_wineGlassCrack != null) {
            return _wineGlassCrack!!
        }
        _wineGlassCrack = Builder(name = "WineGlassCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                lineTo(4.0f, 10.0f)
                curveToRelative(0.0f, 3.898f, 2.803f, 7.154f, 6.5f, 7.858f)
                verticalLineToRelative(3.142f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.142f)
                curveToRelative(3.697f, -0.704f, 6.5f, -3.96f, 6.5f, -7.858f)
                lineTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(3.285f)
                lineToRelative(-2.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-1.177f, 2.943f)
                lineToRelative(2.785f, 1.113f)
                lineToRelative(2.823f, -7.057f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(0.8f, -2.0f)
                horizontalLineToRelative(3.485f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _wineGlassCrack!!
    }

private var _wineGlassCrack: ImageVector? = null

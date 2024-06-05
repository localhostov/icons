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

public val Icons.Filled.WineGlassCrack: ImageVector
    get() {
        if (_wineGlassCrack != null) {
            return _wineGlassCrack!!
        }
        _wineGlassCrack = Builder(name = "WineGlassCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-5.923f)
                lineToRelative(-1.6f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.548f, 6.371f)
                lineToRelative(-1.857f, -0.742f)
                lineToRelative(1.452f, -3.629f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.923f, 0.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 3.519f, 2.613f, 6.432f, 6.0f, 6.92f)
                verticalLineToRelative(6.08f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.08f)
                curveToRelative(3.387f, -0.488f, 6.0f, -3.401f, 6.0f, -6.92f)
                close()
            }
        }
        .build()
        return _wineGlassCrack!!
    }

private var _wineGlassCrack: ImageVector? = null

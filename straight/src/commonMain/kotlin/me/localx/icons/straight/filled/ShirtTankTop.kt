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

public val Icons.Filled.ShirtTankTop: ImageVector
    get() {
        if (_shirtTankTop != null) {
            return _shirtTankTop!!
        }
        _shirtTankTop = Builder(name = "ShirtTankTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.333f, 8.801f)
                curveToRelative(-1.396f, -0.494f, -2.333f, -1.82f, -2.333f, -3.301f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.481f, -0.938f, 2.808f, -2.333f, 3.301f)
                lineToRelative(-0.667f, 0.236f)
                verticalLineToRelative(14.963f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-14.963f)
                lineToRelative(-0.667f, -0.236f)
                close()
            }
        }
        .build()
        return _shirtTankTop!!
    }

private var _shirtTankTop: ImageVector? = null

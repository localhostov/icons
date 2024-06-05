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

public val Icons.Outline.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, 9.456f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -9.456f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.939f, 2.578f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-7.945f, 2.579f)
                curveToRelative(-1.229f, 0.407f, -2.055f, 1.549f, -2.055f, 2.842f)
                verticalLineToRelative(6.525f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.577f, 9.153f, 11.651f)
                lineToRelative(0.805f, 0.402f)
                lineToRelative(0.835f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-6.525f)
                curveToRelative(0.0f, -1.293f, -0.826f, -2.435f, -2.061f, -2.844f)
                close()
                moveTo(20.0f, 11.947f)
                curveToRelative(0.0f, 6.183f, -6.087f, 9.111f, -7.953f, 9.862f)
                curveToRelative(-1.888f, -0.944f, -8.047f, -4.446f, -8.047f, -9.862f)
                verticalLineToRelative(-6.525f)
                curveToRelative(0.0f, -0.429f, 0.274f, -0.808f, 0.678f, -0.941f)
                lineToRelative(7.322f, -2.377f)
                lineToRelative(7.317f, 2.375f)
                curveToRelative(0.409f, 0.135f, 0.683f, 0.515f, 0.683f, 0.943f)
                verticalLineToRelative(6.525f)
                close()
            }
        }
        .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null

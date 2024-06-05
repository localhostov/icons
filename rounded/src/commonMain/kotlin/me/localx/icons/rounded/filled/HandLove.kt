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

public val Icons.Filled.HandLove: ImageVector
    get() {
        if (_handLove != null) {
            return _handLove!!
        }
        _handLove = Builder(name = "HandLove", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(22.248f, 1.02f)
                curveToRelative(-0.738f, 0.12f, -1.248f, 0.813f, -1.248f, 1.56f)
                lineTo(21.0f, 13.308f)
                curveToRelative(0.0f, 1.914f, -1.453f, 3.616f, -3.366f, 3.689f)
                curveToRelative(-0.796f, 0.03f, -1.532f, -0.211f, -2.134f, -0.633f)
                curveToRelative(-0.602f, 0.422f, -1.338f, 0.663f, -2.134f, 0.633f)
                curveToRelative(-1.912f, -0.073f, -3.366f, -1.775f, -3.366f, -3.689f)
                lineTo(10.0f, 1.58f)
                curveToRelative(0.0f, -0.747f, -0.511f, -1.44f, -1.248f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.752f, 0.568f, -1.752f, 1.479f)
                verticalLineToRelative(15.52f)
                lineToRelative(-3.637f, -3.482f)
                curveToRelative(-0.806f, -0.753f, -2.07f, -0.711f, -2.823f, 0.095f)
                curveToRelative(-0.755f, 0.807f, -0.713f, 2.073f, 0.093f, 2.829f)
                lineToRelative(5.488f, 5.295f)
                curveToRelative(1.491f, 1.439f, 3.483f, 2.243f, 5.555f, 2.243f)
                horizontalLineToRelative(7.324f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0.0f, -0.911f, -0.812f, -1.632f, -1.752f, -1.48f)
                close()
            }
        }
        .build()
        return _handLove!!
    }

private var _handLove: ImageVector? = null

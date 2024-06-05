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

public val Icons.Bold.BalletDance: ImageVector
    get() {
        if (_balletDance != null) {
            return _balletDance!!
        }
        _balletDance = Builder(name = "BalletDance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.556f, 14.848f)
                curveToRelative(-0.78f, 0.485f, -1.636f, 0.948f, -2.556f, 1.369f)
                verticalLineToRelative(7.783f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.655f)
                curveToRelative(-3.44f, 1.015f, -6.281f, 0.859f, -6.885f, -0.564f)
                curveToRelative(-0.608f, -1.434f, 1.242f, -3.715f, 4.343f, -5.64f)
                curveTo(3.284f, 7.543f, 1.0f, 3.01f, 1.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.417f, 0.865f, 3.676f, 2.331f, 6.0f)
                horizontalLineToRelative(4.477f)
                curveToRelative(1.487f, -2.363f, 2.333f, -4.635f, 2.333f, -6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.553f, -1.595f, 6.156f, -4.029f, 9.401f)
                curveToRelative(0.421f, 0.596f, 0.822f, 1.132f, 1.08f, 1.396f)
                curveToRelative(0.415f, -0.449f, 1.415f, -1.609f, 1.808f, -2.751f)
                curveToRelative(1.996f, -0.187f, 3.47f, 0.191f, 3.885f, 1.168f)
                curveToRelative(0.179f, 0.422f, 0.138f, 0.92f, -0.078f, 1.46f)
                lineToRelative(4.315f, -1.126f)
                lineToRelative(0.757f, 2.903f)
                reflectiveCurveToRelative(-9.146f, 2.364f, -9.322f, 2.396f)
                close()
                moveTo(8.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _balletDance!!
    }

private var _balletDance: ImageVector? = null

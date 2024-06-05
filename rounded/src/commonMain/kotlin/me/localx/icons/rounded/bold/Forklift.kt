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

public val Icons.Bold.Forklift: ImageVector
    get() {
        if (_forklift != null) {
            return _forklift!!
        }
        _forklift = Builder(name = "Forklift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 18.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.171f)
                lineToRelative(-1.716f, -8.578f)
                curveToRelative(-0.512f, -2.562f, -2.78f, -4.422f, -5.393f, -4.422f)
                horizontalLineToRelative(-3.221f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.099f, -0.01f, -0.197f, -0.029f, -0.294f)
                lineToRelative(-0.541f, -2.706f)
                horizontalLineToRelative(2.571f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(3.221f)
                curveToRelative(1.188f, 0.0f, 2.219f, 0.846f, 2.452f, 2.01f)
                lineToRelative(1.598f, 7.99f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.273f, 0.0f, -0.515f, -0.184f, -0.589f, -0.446f)
                curveToRelative(-0.422f, -1.504f, -1.808f, -2.554f, -3.37f, -2.554f)
                horizontalLineToRelative(-3.642f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(13.771f, 18.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.642f)
                curveToRelative(0.223f, 0.0f, 0.421f, 0.15f, 0.481f, 0.364f)
                curveToRelative(0.436f, 1.552f, 1.866f, 2.636f, 3.478f, 2.636f)
                horizontalLineToRelative(2.77f)
                lineToRelative(0.4f, 2.0f)
                close()
            }
        }
        .build()
        return _forklift!!
    }

private var _forklift: ImageVector? = null

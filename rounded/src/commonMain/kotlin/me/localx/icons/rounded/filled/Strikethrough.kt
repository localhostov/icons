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

public val Icons.Filled.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.081f)
                curveToRelative(-1.863f, -1.003f, -3.081f, -2.97f, -3.081f, -5.151f)
                curveTo(2.0f, 2.624f, 4.624f, 0.0f, 7.848f, 0.0f)
                horizontalLineToRelative(8.235f)
                curveToRelative(3.262f, 0.0f, 5.917f, 2.654f, 5.917f, 5.917f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -2.16f, -1.757f, -3.917f, -3.917f, -3.917f)
                lineTo(7.848f, 2.0f)
                curveToRelative(-2.122f, 0.0f, -3.848f, 1.727f, -3.848f, 3.849f)
                curveToRelative(0.0f, 1.732f, 1.167f, 3.26f, 2.84f, 3.714f)
                lineToRelative(5.293f, 1.438f)
                horizontalLineToRelative(10.867f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(20.057f, 15.11f)
                curveToRelative(-0.495f, 0.244f, -0.698f, 0.844f, -0.454f, 1.34f)
                curveToRelative(0.259f, 0.524f, 0.396f, 1.113f, 0.396f, 1.701f)
                curveToRelative(0.0f, 2.122f, -1.726f, 3.849f, -3.848f, 3.849f)
                lineTo(7.917f, 22.0f)
                curveToRelative(-2.16f, 0.0f, -3.917f, -1.757f, -3.917f, -3.917f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 3.263f, 2.654f, 5.917f, 5.917f, 5.917f)
                horizontalLineToRelative(8.235f)
                curveToRelative(3.225f, 0.0f, 5.848f, -2.624f, 5.848f, -5.849f)
                curveToRelative(0.0f, -0.894f, -0.208f, -1.788f, -0.604f, -2.588f)
                curveToRelative(-0.245f, -0.494f, -0.844f, -0.699f, -1.339f, -0.453f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null

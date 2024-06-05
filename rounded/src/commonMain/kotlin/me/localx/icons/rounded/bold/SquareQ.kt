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

public val Icons.Bold.SquareQ: ImageVector
    get() {
        if (_squareQ != null) {
            return _squareQ!!
        }
        _squareQ = Builder(name = "SquareQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.153f, 16.032f)
                curveToRelative(0.531f, -0.903f, 0.837f, -1.956f, 0.837f, -3.08f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -3.335f, -2.687f, -6.048f, -5.989f, -6.048f)
                reflectiveCurveToRelative(-6.011f, 2.713f, -6.011f, 6.048f)
                verticalLineToRelative(1.903f)
                curveToRelative(0.0f, 3.335f, 2.696f, 6.048f, 6.011f, 6.048f)
                curveToRelative(1.109f, 0.0f, 2.148f, -0.306f, 3.04f, -0.839f)
                lineToRelative(0.399f, 0.399f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-0.408f, -0.408f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.66f, 0.0f, -3.011f, -1.367f, -3.011f, -3.048f)
                verticalLineToRelative(-1.903f)
                curveToRelative(0.0f, -1.681f, 1.351f, -3.048f, 3.011f, -3.048f)
                curveToRelative(1.676f, 0.0f, 2.989f, 1.339f, 2.989f, 3.048f)
                verticalLineToRelative(1.903f)
                curveToRelative(0.0f, 0.283f, -0.037f, 0.555f, -0.104f, 0.812f)
                lineToRelative(-0.325f, -0.325f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                reflectiveCurveToRelative(-0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(0.339f, 0.339f)
                curveToRelative(-0.247f, 0.066f, -0.508f, 0.101f, -0.778f, 0.101f)
                close()
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _squareQ!!
    }

private var _squareQ: ImageVector? = null

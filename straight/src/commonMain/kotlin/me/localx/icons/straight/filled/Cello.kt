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

public val Icons.Filled.Cello: ImageVector
    get() {
        if (_cello != null) {
            return _cello!!
        }
        _cello = Builder(name = "Cello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.707f, 15.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(8.218f, -8.218f)
                curveToRelative(-1.604f, -1.295f, -3.641f, -2.075f, -5.859f, -2.075f)
                curveToRelative(-0.737f, 0.0f, -1.502f, 0.112f, -2.272f, 0.335f)
                lineToRelative(-0.718f, 0.207f)
                lineToRelative(-0.005f, 0.748f)
                curveToRelative(-0.008f, 1.255f, -0.5f, 2.435f, -1.388f, 3.322f)
                curveToRelative(-1.073f, 1.073f, -2.606f, 1.57f, -4.112f, 1.326f)
                lineToRelative(-0.711f, -0.115f)
                lineToRelative(-0.334f, 0.639f)
                curveToRelative(-0.728f, 1.39f, -1.112f, 2.839f, -1.112f, 4.19f)
                curveToRelative(0.0f, 2.218f, 0.78f, 4.255f, 2.075f, 5.859f)
                lineToRelative(3.718f, -3.718f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.718f, 3.718f)
                curveToRelative(1.604f, 1.295f, 3.641f, 2.075f, 5.859f, 2.075f)
                curveToRelative(1.368f, 0.0f, 2.834f, -0.394f, 4.238f, -1.138f)
                lineToRelative(0.661f, -0.351f)
                lineToRelative(-0.15f, -0.733f)
                curveToRelative(-0.32f, -1.567f, 0.162f, -3.177f, 1.291f, -4.305f)
                curveToRelative(0.903f, -0.903f, 2.095f, -1.382f, 3.38f, -1.388f)
                lineToRelative(0.784f, 0.005f)
                lineToRelative(0.192f, -0.76f)
                curveToRelative(0.17f, -0.672f, 0.256f, -1.339f, 0.256f, -1.983f)
                curveToRelative(0.0f, -2.218f, -0.78f, -4.255f, -2.075f, -5.859f)
                lineToRelative(-8.218f, 8.218f)
                close()
                moveTo(17.925f, 7.489f)
                lineToRelative(6.064f, -6.064f)
                lineTo(22.575f, 0.011f)
                lineToRelative(-6.064f, 6.064f)
                curveToRelative(0.52f, 0.42f, 0.994f, 0.894f, 1.414f, 1.414f)
                close()
                moveTo(2.075f, 20.511f)
                lineTo(0.036f, 22.55f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.039f, -2.039f)
                curveToRelative(-0.52f, -0.42f, -0.994f, -0.894f, -1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _cello!!
    }

private var _cello: ImageVector? = null

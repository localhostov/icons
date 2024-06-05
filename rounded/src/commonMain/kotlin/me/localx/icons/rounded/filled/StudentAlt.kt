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

public val Icons.Filled.StudentAlt: ImageVector
    get() {
        if (_studentAlt != null) {
            return _studentAlt!!
        }
        _studentAlt = Builder(name = "StudentAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.002f, 5.512f)
                curveToRelative(0.001f, -0.978f, -0.579f, -1.823f, -1.479f, -2.153f)
                lineTo(14.621f, 0.459f)
                curveToRelative(-1.657f, -0.607f, -3.48f, -0.611f, -5.136f, -0.007f)
                lineTo(1.486f, 3.362f)
                curveTo(0.584f, 3.691f, 0.001f, 4.536f, 0.002f, 5.514f)
                curveToRelative(0.0f, 0.979f, 0.584f, 1.823f, 1.486f, 2.15f)
                lineToRelative(7.954f, 2.886f)
                curveToRelative(0.823f, 0.299f, 1.688f, 0.448f, 2.552f, 0.448f)
                reflectiveCurveToRelative(1.728f, -0.149f, 2.55f, -0.448f)
                lineToRelative(7.456f, -2.705f)
                verticalLineToRelative(4.154f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, 0.002f, -6.483f, 0.002f, -6.488f)
                close()
                moveTo(2.203f, 16.041f)
                curveToRelative(2.087f, 0.523f, 6.052f, 1.652f, 8.797f, 1.904f)
                verticalLineToRelative(4.11f)
                curveToRelative(-2.745f, 0.252f, -6.711f, 1.382f, -8.797f, 1.904f)
                curveToRelative(-1.121f, 0.281f, -2.203f, -0.571f, -2.203f, -1.727f)
                verticalLineToRelative(-4.464f)
                curveToRelative(0.0f, -1.156f, 1.082f, -2.008f, 2.203f, -1.727f)
                close()
                moveTo(24.0f, 17.768f)
                verticalLineToRelative(4.464f)
                curveToRelative(0.0f, 1.156f, -1.082f, 2.008f, -2.203f, 1.727f)
                curveToRelative(-2.087f, -0.523f, -6.052f, -1.652f, -8.797f, -1.904f)
                verticalLineToRelative(-4.11f)
                curveToRelative(2.745f, -0.252f, 6.711f, -1.382f, 8.797f, -1.904f)
                curveToRelative(1.121f, -0.281f, 2.203f, 0.571f, 2.203f, 1.727f)
                close()
                moveTo(5.0f, 14.697f)
                verticalLineToRelative(-3.631f)
                lineToRelative(3.759f, 1.364f)
                curveToRelative(2.074f, 0.753f, 4.389f, 0.754f, 6.467f, 0.0f)
                lineToRelative(3.773f, -1.369f)
                verticalLineToRelative(3.635f)
                curveToRelative(-1.954f, 0.501f, -4.5f, 1.332f, -7.0f, 1.332f)
                reflectiveCurveToRelative(-5.046f, -0.831f, -7.0f, -1.332f)
                close()
            }
        }
        .build()
        return _studentAlt!!
    }

private var _studentAlt: ImageVector? = null

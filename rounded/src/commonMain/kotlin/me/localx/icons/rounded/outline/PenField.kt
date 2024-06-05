package me.localx.icons.rounded.outline

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

public val Icons.Outline.PenField: ImageVector
    get() {
        if (_penField != null) {
            return _penField!!
        }
        _penField = Builder(name = "PenField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.75f, 9.693f)
                curveToRelative(0.806f, 0.914f, 1.25f, 2.088f, 1.25f, 3.307f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.731f, -0.267f, -1.436f, -0.75f, -1.984f)
                curveToRelative(-0.365f, -0.414f, -0.326f, -1.046f, 0.089f, -1.412f)
                curveToRelative(0.413f, -0.364f, 1.045f, -0.326f, 1.411f, 0.088f)
                close()
                moveTo(5.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 17.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -1.068f, 0.416f, -2.073f, 1.172f, -2.828f)
                lineTo(18.879f, 0.879f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.755f, 0.755f, -1.76f, 1.172f, -2.828f, 1.172f)
                horizontalLineToRelative(-1.586f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.534f, 0.0f, 1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.372f, 0.373f, -0.586f, 0.888f, -0.586f, 1.414f)
                verticalLineToRelative(0.586f)
                close()
            }
        }
        .build()
        return _penField!!
    }

private var _penField: ImageVector? = null

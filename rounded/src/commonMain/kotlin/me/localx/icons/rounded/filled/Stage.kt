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

public val Icons.Filled.Stage: ImageVector
    get() {
        if (_stage != null) {
            return _stage!!
        }
        _stage = Builder(name = "Stage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-4.597f)
                lineToRelative(-4.282f, -4.121f)
                curveToRelative(-0.318f, -0.318f, -0.706f, -0.536f, -1.121f, -0.674f)
                lineTo(13.0f, 6.414f)
                lineToRelative(1.591f, -1.591f)
                curveToRelative(0.282f, 0.111f, 0.588f, 0.177f, 0.909f, 0.177f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.322f, 0.066f, 0.627f, 0.177f, 0.909f)
                lineToRelative(-4.884f, 4.884f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(1.293f, -1.293f)
                verticalLineToRelative(8.788f)
                curveToRelative(-0.412f, 0.137f, -0.796f, 0.352f, -1.107f, 0.663f)
                lineToRelative(-4.296f, 4.135f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.293f, 19.293f)
                curveToRelative(0.377f, -0.379f, 1.022f, -0.393f, 1.427f, 0.014f)
                lineToRelative(2.798f, 2.693f)
                horizontalLineToRelative(-7.038f)
                lineToRelative(2.812f, -2.707f)
                close()
            }
        }
        .build()
        return _stage!!
    }

private var _stage: ImageVector? = null

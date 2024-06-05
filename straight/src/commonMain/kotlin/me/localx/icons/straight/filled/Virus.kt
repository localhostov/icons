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

public val Icons.Filled.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 19.0f)
                curveToRelative(-0.321f, 0.0f, -0.626f, 0.066f, -0.909f, 0.177f)
                lineToRelative(-1.566f, -1.566f)
                curveToRelative(0.538f, -0.672f, 0.981f, -1.422f, 1.311f, -2.231f)
                lineToRelative(2.894f, 0.812f)
                lineToRelative(0.54f, -1.926f)
                lineToRelative(-2.898f, -0.814f)
                curveToRelative(0.077f, -0.474f, 0.128f, -0.957f, 0.128f, -1.453f)
                reflectiveCurveToRelative(-0.051f, -0.979f, -0.128f, -1.453f)
                lineToRelative(2.898f, -0.814f)
                lineToRelative(-0.54f, -1.926f)
                lineToRelative(-2.894f, 0.812f)
                curveToRelative(-0.329f, -0.809f, -0.773f, -1.559f, -1.311f, -2.231f)
                lineToRelative(1.566f, -1.566f)
                curveToRelative(0.282f, 0.111f, 0.588f, 0.177f, 0.909f, 0.177f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.321f, 0.066f, 0.626f, 0.177f, 0.909f)
                lineToRelative(-1.566f, 1.566f)
                curveToRelative(-0.672f, -0.538f, -1.422f, -0.981f, -2.231f, -1.31f)
                lineToRelative(0.813f, -2.894f)
                lineToRelative(-1.926f, -0.541f)
                lineToRelative(-0.814f, 2.899f)
                curveToRelative(-0.474f, -0.077f, -0.957f, -0.128f, -1.453f, -0.128f)
                reflectiveCurveToRelative(-0.979f, 0.051f, -1.453f, 0.128f)
                lineToRelative(-0.814f, -2.899f)
                lineToRelative(-1.926f, 0.541f)
                lineToRelative(0.813f, 2.894f)
                curveToRelative(-0.809f, 0.329f, -1.559f, 0.773f, -2.231f, 1.31f)
                lineToRelative(-1.566f, -1.566f)
                curveToRelative(0.111f, -0.282f, 0.177f, -0.587f, 0.177f, -0.909f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(0.0f, 1.121f, 0.0f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.321f, 0.0f, 0.626f, -0.066f, 0.909f, -0.177f)
                lineToRelative(1.566f, 1.566f)
                curveToRelative(-0.538f, 0.672f, -0.981f, 1.422f, -1.311f, 2.231f)
                lineToRelative(-2.894f, -0.812f)
                lineToRelative(-0.54f, 1.926f)
                lineToRelative(2.898f, 0.814f)
                curveToRelative(-0.077f, 0.474f, -0.128f, 0.957f, -0.128f, 1.453f)
                reflectiveCurveToRelative(0.051f, 0.979f, 0.128f, 1.453f)
                lineToRelative(-2.898f, 0.814f)
                lineToRelative(0.54f, 1.926f)
                lineToRelative(2.894f, -0.812f)
                curveToRelative(0.329f, 0.809f, 0.773f, 1.559f, 1.311f, 2.231f)
                lineToRelative(-1.566f, 1.566f)
                curveToRelative(-0.282f, -0.111f, -0.588f, -0.177f, -0.909f, -0.177f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.321f, -0.066f, -0.626f, -0.177f, -0.909f)
                lineToRelative(1.566f, -1.566f)
                curveToRelative(0.672f, 0.538f, 1.422f, 0.981f, 2.231f, 1.31f)
                lineToRelative(-0.813f, 2.894f)
                lineToRelative(1.926f, 0.541f)
                lineToRelative(0.814f, -2.899f)
                curveToRelative(0.474f, 0.077f, 0.957f, 0.128f, 1.453f, 0.128f)
                reflectiveCurveToRelative(0.979f, -0.051f, 1.453f, -0.128f)
                lineToRelative(0.814f, 2.899f)
                lineToRelative(1.926f, -0.541f)
                lineToRelative(-0.813f, -2.894f)
                curveToRelative(0.809f, -0.329f, 1.559f, -0.773f, 2.231f, -1.31f)
                lineToRelative(1.566f, 1.566f)
                curveToRelative(-0.111f, 0.282f, -0.177f, 0.587f, -0.177f, 0.909f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.464f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.5f, 16.536f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 8.965f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.535f, 13.501f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null

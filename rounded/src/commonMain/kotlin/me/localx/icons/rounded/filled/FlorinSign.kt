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

public val Icons.Filled.FlorinSign: ImageVector
    get() {
        if (_florinSign != null) {
            return _florinSign!!
        }
        _florinSign = Builder(name = "FlorinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-1.17f, 0.0f, -2.25f, 0.69f, -2.73f, 1.76f)
                lineToRelative(-2.84f, 6.24f)
                horizontalLineToRelative(3.99f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.9f)
                lineToRelative(-4.12f, 9.07f)
                curveToRelative(-0.81f, 1.78f, -2.59f, 2.93f, -4.55f, 2.93f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.42f)
                curveToRelative(1.17f, 0.0f, 2.25f, -0.69f, 2.73f, -1.76f)
                lineToRelative(3.75f, -8.24f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.81f)
                lineToRelative(3.21f, -7.07f)
                curveToRelative(0.81f, -1.78f, 2.59f, -2.93f, 4.55f, -2.93f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _florinSign!!
    }

private var _florinSign: ImageVector? = null

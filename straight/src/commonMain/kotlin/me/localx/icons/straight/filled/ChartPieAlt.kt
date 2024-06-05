package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.209f, 65.285f)
                lineToRelative(-0.276f, -21.258f)
                horizontalLineToRelative(-21.258f)
                curveToRelative(-1.485f, -0.014f, -2.97f, -0.014f, -4.455f, 0.0f)
                curveTo(102.431f, 45.257f, -0.977f, 150.659f, 0.253f, 279.448f)
                curveToRelative(1.23f, 128.79f, 106.632f, 232.197f, 235.421f, 230.967f)
                curveToRelative(128.729f, -0.141f, 233.052f, -104.455f, 233.205f, -233.183f)
                verticalLineToRelative(-21.258f)
                horizontalLineTo(256.933f)
                lineTo(257.209f, 65.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(299.854f, 1.574f)
                lineTo(299.854f, 1.574f)
                lineToRelative(0.0f, 211.925f)
                horizontalLineToRelative(211.904f)
                curveTo(511.211f, 96.692f, 416.661f, 2.133f, 299.854f, 1.574f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null

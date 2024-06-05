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

public val Icons.Filled.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) {
            return _cassetteTape!!
        }
        _cassetteTape = Builder(name = "CassetteTape", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(7.54f, 19.0f)
                lineToRelative(-1.33f, 2.0f)
                horizontalLineToRelative(11.6f)
                lineToRelative(-1.33f, -2.0f)
                lineTo(7.54f, 19.0f)
                close()
                moveTo(9.82f, 12.0f)
                horizontalLineToRelative(4.37f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1.0f)
                reflectiveCurveToRelative(0.07f, -0.69f, 0.18f, -1.0f)
                horizontalLineToRelative(-4.37f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f)
                reflectiveCurveToRelative(-0.07f, 0.69f, -0.18f, 1.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.37f, -1.67f, 4.36f, -3.89f, 4.87f)
                lineToRelative(-2.28f, -3.42f)
                curveToRelative(-0.19f, -0.28f, -0.5f, -0.45f, -0.83f, -0.45f)
                lineTo(7.0f, 17.0f)
                curveToRelative(-0.33f, 0.0f, -0.65f, 0.17f, -0.83f, 0.45f)
                lineToRelative(-2.28f, 3.42f)
                curveToRelative(-2.22f, -0.51f, -3.89f, -2.49f, -3.89f, -4.87f)
                lineTo(0.0f, 8.0f)
                curveTo(0.0f, 5.24f, 2.24f, 3.0f, 5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 8.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null

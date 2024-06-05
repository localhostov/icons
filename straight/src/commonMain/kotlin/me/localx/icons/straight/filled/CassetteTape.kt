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
                moveTo(16.41f, 19.02f)
                lineToRelative(1.08f, 1.98f)
                lineTo(6.51f, 21.0f)
                lineToRelative(1.08f, -1.98f)
                horizontalLineToRelative(8.81f)
                close()
                moveTo(14.19f, 10.0f)
                horizontalLineToRelative(-4.37f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f)
                reflectiveCurveToRelative(-0.07f, 0.69f, -0.18f, 1.0f)
                horizontalLineToRelative(4.37f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1.0f)
                reflectiveCurveToRelative(0.07f, -0.69f, 0.18f, -1.0f)
                close()
                moveTo(7.01f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(-2.17f, -3.98f)
                lineTo(6.41f, 17.02f)
                lineToRelative(-2.17f, 3.98f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
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

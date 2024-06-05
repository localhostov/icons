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

public val Icons.Filled.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.576f)
                curveToRelative(-0.774f, 1.763f, -2.531f, 3.0f, -4.576f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(0.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.424f, 21.0f)
                curveToRelative(0.774f, 1.763f, 2.531f, 3.0f, 4.576f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(8.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 9.724f)
                verticalLineToRelative(0.276f)
                reflectiveCurveToRelative(0.0f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 11.0f)
                curveToRelative(-1.0f, 0.0f, -1.0f, -1.0f, -1.0f, -1.0f)
                verticalLineToRelative(-0.276f)
                curveToRelative(0.0f, -1.662f, 0.826f, -3.216f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.69f, -1.141f, 3.904f, -1.141f, 5.594f, 0.0f)
                lineToRelative(5.203f, 3.511f)
                lineTo(20.0f, 2.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.724f)
                curveToRelative(1.256f, 0.942f, 2.0f, 2.418f, 2.0f, 4.0f)
                close()
                moveTo(13.5f, 6.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null

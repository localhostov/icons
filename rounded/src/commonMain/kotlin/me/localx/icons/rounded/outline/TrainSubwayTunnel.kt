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

public val Icons.Outline.TrainSubwayTunnel: ImageVector
    get() {
        if (_trainSubwayTunnel != null) {
            return _trainSubwayTunnel!!
        }
        _trainSubwayTunnel = Builder(name = "TrainSubwayTunnel", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.901f, 1.333f, 3.496f, 3.113f, 3.901f)
                lineToRelative(-0.966f, 1.577f)
                curveToRelative(-0.289f, 0.471f, -0.141f, 1.087f, 0.33f, 1.375f)
                curveToRelative(0.163f, 0.1f, 0.343f, 0.147f, 0.521f, 0.147f)
                curveToRelative(0.336f, 0.0f, 0.665f, -0.17f, 0.854f, -0.478f)
                lineToRelative(1.545f, -2.522f)
                horizontalLineToRelative(5.205f)
                lineToRelative(1.545f, 2.522f)
                curveToRelative(0.188f, 0.308f, 0.517f, 0.478f, 0.854f, 0.478f)
                curveToRelative(0.178f, 0.0f, 0.358f, -0.048f, 0.521f, -0.147f)
                curveToRelative(0.471f, -0.288f, 0.619f, -0.904f, 0.33f, -1.375f)
                lineToRelative(-0.966f, -1.577f)
                curveToRelative(1.78f, -0.404f, 3.113f, -1.999f, 3.113f, -3.901f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trainSubwayTunnel!!
    }

private var _trainSubwayTunnel: ImageVector? = null

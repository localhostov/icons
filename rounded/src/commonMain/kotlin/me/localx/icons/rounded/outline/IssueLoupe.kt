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

public val Icons.Outline.IssueLoupe: ImageVector
    get() {
        if (_issueLoupe != null) {
            return _issueLoupe!!
        }
        _issueLoupe = Builder(name = "IssueLoupe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-5.963f, -5.963f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.398f, 0.0f, 4.6f, -0.85f, 6.324f, -2.262f)
                lineToRelative(5.963f, 5.963f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(2.006f, 10.006f)
                curveTo(2.006f, 5.595f, 5.595f, 2.006f, 10.006f, 2.006f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveTo(2.006f, 14.417f, 2.006f, 10.006f)
                close()
                moveTo(11.5f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, 1.125f, -0.621f, 2.146f, -1.621f, 2.665f)
                curveToRelative(-0.174f, 0.09f, -0.304f, 0.287f, -0.355f, 0.538f)
                curveToRelative(-0.016f, 0.074f, -0.023f, 0.15f, -0.023f, 0.227f)
                verticalLineToRelative(0.571f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.571f)
                curveToRelative(0.0f, -0.213f, 0.021f, -0.426f, 0.065f, -0.633f)
                curveToRelative(0.174f, -0.842f, 0.682f, -1.538f, 1.393f, -1.907f)
                curveToRelative(0.335f, -0.173f, 0.542f, -0.514f, 0.542f, -0.889f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _issueLoupe!!
    }

private var _issueLoupe: ImageVector? = null

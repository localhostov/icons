package me.localx.icons.straight.outline

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
                moveToRelative(23.995f, 22.582f)
                lineToRelative(-6.251f, -6.251f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.398f, 0.0f, 4.6f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.251f, 6.251f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.006f, 18.006f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(5.595f, 2.006f, 10.006f, 2.006f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, 1.125f, -0.621f, 2.146f, -1.621f, 2.665f)
                curveToRelative(-0.227f, 0.118f, -0.379f, 0.425f, -0.379f, 0.765f)
                verticalLineToRelative(0.571f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.571f)
                curveToRelative(0.0f, -1.1f, 0.559f, -2.073f, 1.458f, -2.54f)
                curveToRelative(0.335f, -0.173f, 0.542f, -0.514f, 0.542f, -0.889f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _issueLoupe!!
    }

private var _issueLoupe: ImageVector? = null

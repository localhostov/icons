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

public val Icons.Outline.CommentMedical: ImageVector
    get() {
        if (_commentMedical != null) {
            return _commentMedical!!
        }
        _commentMedical = Builder(name = "CommentMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.854f, 0.03f)
                curveToRelative(-3.478f, -0.243f, -6.883f, 1.029f, -9.339f, 3.485f)
                curveTo(1.059f, 5.971f, -0.211f, 9.375f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.065f, 11.146f, 13.083f, 11.146f)
                horizontalLineToRelative(5.888f)
                curveToRelative(2.943f, 0.0f, 4.999f, -2.404f, 4.999f, -5.847f)
                verticalLineToRelative(-5.815f)
                curveTo(24.0f, 5.869f, 19.104f, 0.463f, 12.854f, 0.03f)
                close()
                moveTo(22.0f, 18.153f)
                curveToRelative(0.0f, 2.301f, -1.205f, 3.847f, -2.999f, 3.847f)
                horizontalLineToRelative(-5.888f)
                curveToRelative(-6.052f, 0.0f, -10.715f, -3.905f, -11.088f, -9.285f)
                curveToRelative(-0.201f, -2.901f, 0.857f, -5.74f, 2.904f, -7.786f)
                curveToRelative(1.882f, -1.882f, 4.432f, -2.929f, 7.086f, -2.929f)
                curveToRelative(0.232f, 0.0f, 0.466f, 0.008f, 0.7f, 0.024f)
                curveToRelative(5.207f, 0.361f, 9.285f, 4.891f, 9.285f, 10.312f)
                verticalLineToRelative(5.815f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _commentMedical!!
    }

private var _commentMedical: ImageVector? = null

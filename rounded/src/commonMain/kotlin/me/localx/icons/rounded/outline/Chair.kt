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

public val Icons.Outline.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.257f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                lineTo(5.0f, 13.257f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(20.0f, 19.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.956f, -1.254f, -3.624f, -3.0f, -4.243f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.172f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 2.172f)
                lineTo(9.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                close()
                moveTo(6.5f, 15.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.207f, 0.0f, 2.217f, 0.86f, 2.45f, 2.0f)
                lineTo(4.05f, 17.0f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.45f, -2.0f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null

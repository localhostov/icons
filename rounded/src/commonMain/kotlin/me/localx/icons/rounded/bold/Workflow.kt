package me.localx.icons.rounded.bold

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

public val Icons.Bold.Workflow: ImageVector
    get() {
        if (_workflow != null) {
            return _workflow!!
        }
        _workflow = Builder(name = "Workflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.5f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 1.0f)
                curveToRelative(-0.552f, -0.552f, -1.448f, -0.552f, -2.0f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.552f, 0.552f, -0.552f, 1.448f, 0.0f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.552f, 0.552f, 1.448f, 0.552f, 2.0f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.552f, -0.552f, 0.552f, -1.448f, 0.0f, -2.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(13.5f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-0.499f)
                verticalLineToRelative(-0.951f)
                curveToRelative(0.0f, -0.69f, -0.835f, -1.036f, -1.323f, -0.548f)
                lineToRelative(-2.451f, 2.451f)
                curveToRelative(-0.303f, 0.303f, -0.303f, 0.793f, 0.0f, 1.096f)
                lineToRelative(2.451f, 2.451f)
                curveToRelative(0.488f, 0.488f, 1.323f, 0.142f, 1.323f, -0.548f)
                verticalLineToRelative(-0.951f)
                horizontalLineToRelative(0.499f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5.323f, 17.501f)
                curveToRelative(-0.488f, -0.488f, -1.323f, -0.142f, -1.323f, 0.548f)
                verticalLineToRelative(0.951f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.951f)
                curveToRelative(0.0f, 0.69f, 0.835f, 1.036f, 1.323f, 0.548f)
                lineToRelative(2.451f, -2.451f)
                curveToRelative(0.303f, -0.303f, 0.303f, -0.793f, 0.0f, -1.096f)
                lineToRelative(-2.451f, -2.451f)
                close()
            }
        }
        .build()
        return _workflow!!
    }

private var _workflow: ImageVector? = null

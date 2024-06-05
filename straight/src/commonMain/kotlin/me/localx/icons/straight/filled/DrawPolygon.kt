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

public val Icons.Filled.DrawPolygon: ImageVector
    get() {
        if (_drawPolygon != null) {
            return _drawPolygon!!
        }
        _drawPolygon = Builder(name = "DrawPolygon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                curveToRelative(-0.413f, 0.0f, -0.807f, 0.084f, -1.165f, 0.235f)
                lineToRelative(-4.215f, -4.777f)
                curveToRelative(0.241f, -0.432f, 0.38f, -0.929f, 0.38f, -1.458f)
                curveToRelative(0.0f, -0.534f, -0.141f, -1.035f, -0.386f, -1.47f)
                lineToRelative(4.183f, -4.783f)
                curveToRelative(0.369f, 0.162f, 0.776f, 0.253f, 1.203f, 0.253f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                horizontalLineTo(5.828f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.415f, 2.0f, 2.828f)
                verticalLineToRelative(12.344f)
                curveToRelative(-1.164f, 0.413f, -2.0f, 1.524f, -2.0f, 2.828f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, -0.836f, 2.828f, -2.0f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.828f, 4.0f)
                horizontalLineToRelative(12.344f)
                curveToRelative(0.046f, 0.13f, 0.102f, 0.257f, 0.165f, 0.378f)
                lineToRelative(-4.228f, 4.835f)
                curveToRelative(-0.343f, -0.137f, -0.717f, -0.213f, -1.109f, -0.213f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.396f, 0.0f, 0.774f, -0.078f, 1.121f, -0.218f)
                lineToRelative(4.236f, 4.801f)
                curveToRelative(-0.072f, 0.133f, -0.133f, 0.273f, -0.185f, 0.417f)
                horizontalLineTo(5.828f)
                curveToRelative(-0.302f, -0.851f, -0.977f, -1.526f, -1.828f, -1.828f)
                verticalLineTo(5.828f)
                curveToRelative(0.851f, -0.302f, 1.526f, -0.977f, 1.828f, -1.828f)
                close()
            }
        }
        .build()
        return _drawPolygon!!
    }

private var _drawPolygon: ImageVector? = null

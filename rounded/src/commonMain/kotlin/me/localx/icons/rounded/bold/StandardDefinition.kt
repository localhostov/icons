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

public val Icons.Bold.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) {
            return _standardDefinition!!
        }
        _standardDefinition = Builder(name = "StandardDefinition", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 2.0f)
                lineTo(5.5f, 2.0f)
                curveTo(2.468f, 2.0f, 0.0f, 4.467f, 0.0f, 7.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 16.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(15.5f, 7.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                reflectiveCurveToRelative(0.0f, -6.0f, 0.0f, -6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.023f, 9.75f)
                curveToRelative(0.0f, 0.488f, 0.475f, 0.81f, 1.48f, 1.379f)
                curveToRelative(1.054f, 0.596f, 2.496f, 1.412f, 2.496f, 3.12f)
                curveToRelative(0.0f, 1.517f, -1.234f, 2.75f, -2.751f, 2.75f)
                horizontalLineToRelative(-0.667f)
                curveToRelative(-1.056f, 0.0f, -2.031f, -0.616f, -2.485f, -1.57f)
                curveToRelative(-0.237f, -0.499f, -0.025f, -1.096f, 0.474f, -1.333f)
                curveToRelative(0.5f, -0.237f, 1.096f, -0.025f, 1.333f, 0.473f)
                curveToRelative(0.124f, 0.261f, 0.391f, 0.43f, 0.679f, 0.43f)
                horizontalLineToRelative(0.667f)
                curveToRelative(0.414f, 0.0f, 0.751f, -0.337f, 0.751f, -0.75f)
                curveToRelative(0.0f, -0.488f, -0.475f, -0.81f, -1.48f, -1.379f)
                curveToRelative(-1.054f, -0.596f, -2.496f, -1.412f, -2.496f, -3.12f)
                curveToRelative(0.0f, -1.517f, 1.234f, -2.75f, 2.751f, -2.75f)
                horizontalLineToRelative(0.644f)
                curveToRelative(1.056f, 0.0f, 2.031f, 0.616f, 2.485f, 1.57f)
                curveToRelative(0.237f, 0.499f, 0.025f, 1.096f, -0.474f, 1.333f)
                curveToRelative(-0.501f, 0.237f, -1.095f, 0.024f, -1.333f, -0.473f)
                curveToRelative(-0.124f, -0.261f, -0.391f, -0.43f, -0.679f, -0.43f)
                horizontalLineToRelative(-0.644f)
                curveToRelative(-0.414f, 0.0f, -0.751f, 0.337f, -0.751f, 0.75f)
                close()
            }
        }
        .build()
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null

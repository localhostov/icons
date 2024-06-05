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

public val Icons.Filled.ComplianceClipboard: ImageVector
    get() {
        if (_complianceClipboard != null) {
            return _complianceClipboard!!
        }
        _complianceClipboard = Builder(name = "ComplianceClipboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.501f, 23.991f)
                curveToRelative(-0.36f, 0.0f, -0.648f, -0.206f, -0.648f, -0.206f)
                curveToRelative(-1.138f, -0.569f, -4.853f, -2.704f, -4.853f, -6.272f)
                verticalLineToRelative(-3.187f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.056f, -2.848f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.5f, -0.829f)
                curveToRelative(0.609f, -0.201f, 1.28f, -0.201f, 1.888f, 0.0f)
                lineToRelative(2.501f, 0.829f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.552f, 2.056f, 2.848f)
                verticalLineToRelative(3.187f)
                curveToRelative(0.0f, 4.031f, -3.763f, 5.858f, -4.917f, 6.322f)
                curveToRelative(0.0f, 0.0f, -0.222f, 0.156f, -0.582f, 0.156f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.447f, 0.0f, 0.873f, -0.078f, 1.286f, -0.189f)
                curveToRelative(-1.625f, -1.366f, -3.286f, -3.453f, -3.286f, -6.299f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.674f)
                curveToRelative(0.0f, -0.458f, 0.074f, -0.9f, 0.191f, -1.326f)
                horizontalLineToRelative(-6.191f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.289f)
                curveToRelative(0.567f, -0.634f, 1.288f, -1.138f, 2.137f, -1.42f)
                lineToRelative(2.501f, -0.83f)
                curveToRelative(0.349f, -0.115f, 0.71f, -0.176f, 1.074f, -0.212f)
                verticalLineToRelative(-1.538f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _complianceClipboard!!
    }

private var _complianceClipboard: ImageVector? = null

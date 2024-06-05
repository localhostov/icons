package me.localx.icons.straight.bold

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

public val Icons.Bold.BadgeLeaf: ImageVector
    get() {
        if (_badgeLeaf != null) {
            return _badgeLeaf!!
        }
        _badgeLeaf = Builder(name = "BadgeLeaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 12.0f)
                curveToRelative(0.0f, 1.862f, -1.278f, 3.412f, -3.0f, 3.859f)
                verticalLineToRelative(-4.859f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.859f)
                curveToRelative(-1.722f, -0.446f, -3.0f, -1.997f, -3.0f, -3.859f)
                curveToRelative(0.0f, -2.316f, 2.737f, -4.737f, 4.0f, -6.0f)
                curveToRelative(1.263f, 1.263f, 4.0f, 3.684f, 4.0f, 6.0f)
                close()
                moveTo(11.0f, 15.859f)
                verticalLineToRelative(2.141f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.141f)
                curveToRelative(-0.321f, 0.083f, -0.653f, 0.141f, -1.0f, 0.141f)
                reflectiveCurveToRelative(-0.679f, -0.058f, -1.0f, -0.141f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 1.612f, -0.667f, 3.131f, -1.82f, 4.217f)
                curveToRelative(0.047f, 1.583f, -0.555f, 3.129f, -1.695f, 4.269f)
                reflectiveCurveToRelative(-2.69f, 1.747f, -4.269f, 1.695f)
                curveToRelative(-1.086f, 1.153f, -2.605f, 1.82f, -4.217f, 1.82f)
                reflectiveCurveToRelative(-3.131f, -0.667f, -4.217f, -1.82f)
                curveToRelative(-1.583f, 0.047f, -3.129f, -0.555f, -4.269f, -1.695f)
                reflectiveCurveToRelative(-1.742f, -2.685f, -1.695f, -4.269f)
                curveToRelative(-1.153f, -1.086f, -1.82f, -2.605f, -1.82f, -4.217f)
                reflectiveCurveToRelative(0.667f, -3.131f, 1.82f, -4.217f)
                curveToRelative(-0.047f, -1.583f, 0.555f, -3.129f, 1.695f, -4.269f)
                curveToRelative(1.139f, -1.14f, 2.685f, -1.744f, 4.269f, -1.695f)
                curveToRelative(1.086f, -1.153f, 2.605f, -1.82f, 4.217f, -1.82f)
                reflectiveCurveToRelative(3.131f, 0.667f, 4.217f, 1.82f)
                curveToRelative(1.57f, -0.06f, 3.128f, 0.555f, 4.269f, 1.695f)
                curveToRelative(1.14f, 1.14f, 1.742f, 2.685f, 1.695f, 4.269f)
                curveToRelative(1.153f, 1.086f, 1.82f, 2.605f, 1.82f, 4.217f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -0.931f, -0.462f, -1.798f, -1.235f, -2.32f)
                lineToRelative(-0.824f, -0.555f)
                lineToRelative(0.19f, -0.975f)
                curveToRelative(0.178f, -0.916f, -0.108f, -1.856f, -0.767f, -2.514f)
                curveToRelative(-0.659f, -0.658f, -1.6f, -0.942f, -2.514f, -0.767f)
                lineToRelative(-0.975f, 0.19f)
                lineToRelative(-0.555f, -0.824f)
                curveToRelative(-0.521f, -0.773f, -1.389f, -1.235f, -2.32f, -1.235f)
                reflectiveCurveToRelative(-1.798f, 0.462f, -2.32f, 1.235f)
                lineToRelative(-0.555f, 0.824f)
                lineToRelative(-0.975f, -0.19f)
                curveToRelative(-0.917f, -0.177f, -1.855f, 0.108f, -2.514f, 0.767f)
                curveToRelative(-0.658f, 0.658f, -0.945f, 1.598f, -0.767f, 2.514f)
                lineToRelative(0.19f, 0.975f)
                lineToRelative(-0.824f, 0.555f)
                curveToRelative(-0.773f, 0.521f, -1.235f, 1.389f, -1.235f, 2.32f)
                reflectiveCurveToRelative(0.462f, 1.798f, 1.235f, 2.32f)
                lineToRelative(0.824f, 0.555f)
                lineToRelative(-0.19f, 0.975f)
                curveToRelative(-0.178f, 0.916f, 0.108f, 1.856f, 0.767f, 2.514f)
                reflectiveCurveToRelative(1.6f, 0.944f, 2.514f, 0.767f)
                lineToRelative(0.975f, -0.19f)
                lineToRelative(0.555f, 0.824f)
                curveToRelative(0.521f, 0.773f, 1.389f, 1.235f, 2.32f, 1.235f)
                reflectiveCurveToRelative(1.798f, -0.462f, 2.32f, -1.235f)
                lineToRelative(0.555f, -0.824f)
                lineToRelative(0.975f, 0.19f)
                curveToRelative(0.915f, 0.178f, 1.855f, -0.108f, 2.514f, -0.767f)
                curveToRelative(0.658f, -0.658f, 0.945f, -1.598f, 0.767f, -2.514f)
                lineToRelative(-0.19f, -0.975f)
                lineToRelative(0.824f, -0.555f)
                curveToRelative(0.773f, -0.521f, 1.235f, -1.389f, 1.235f, -2.32f)
                close()
            }
        }
        .build()
        return _badgeLeaf!!
    }

private var _badgeLeaf: ImageVector? = null

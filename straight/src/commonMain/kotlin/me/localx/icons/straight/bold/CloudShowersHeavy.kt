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

public val Icons.Bold.CloudShowersHeavy: ImageVector
    get() {
        if (_cloudShowersHeavy != null) {
            return _cloudShowersHeavy!!
        }
        _cloudShowersHeavy = Builder(name = "CloudShowersHeavy", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.179f, 15.985f)
                lineToRelative(2.768f, 1.159f)
                lineTo(8.073f, 24.015f)
                lineTo(5.305f, 22.856f)
                close()
                moveTo(11.053f, 22.856f)
                lineTo(13.821f, 24.015f)
                lineTo(16.694f, 17.144f)
                lineTo(13.927f, 15.985f)
                close()
                moveTo(0.023f, 14.387f)
                horizontalLineToRelative(0.0f)
                curveTo(0.022f, 14.394f, 0.022f, 14.4f, 0.023f, 14.387f)
                close()
                moveTo(17.584f, 5.1f)
                arcTo(8.294f, 8.294f, 0.0f, false, false, 10.091f, 0.0f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 2.0f, 8.0f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, 0.133f, 1.893f)
                arcTo(5.765f, 5.765f, 0.0f, false, false, 0.0f, 14.387f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, false, 4.254f, 5.8f)
                lineToRelative(1.159f, -2.772f)
                lineToRelative(-0.741f, -0.272f)
                arcToRelative(3.225f, 3.225f, 0.0f, false, true, -1.658f, -2.814f)
                arcTo(2.89f, 2.89f, 0.0f, false, true, 4.527f, 11.9f)
                lineToRelative(1.2f, -0.613f)
                lineToRelative(-0.479f, -1.258f)
                arcTo(5.918f, 5.918f, 0.0f, false, true, 5.0f, 8.0f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.091f, -5.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 4.971f, 3.927f)
                lineToRelative(0.308f, 1.038f)
                lineTo(16.452f, 8.0f)
                arcToRelative(4.534f, 4.534f, 0.0f, false, true, 4.568f, 4.479f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, true, -1.808f, 3.827f)
                lineToRelative(-1.681f, 4.022f)
                arcTo(8.05f, 8.05f, 0.0f, false, false, 24.02f, 12.48f)
                arcTo(7.715f, 7.715f, 0.0f, false, false, 17.584f, 5.1f)
                close()
                moveTo(24.02f, 12.48f)
                curveToRelative(0.0f, -0.093f, 0.016f, 0.088f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudShowersHeavy!!
    }

private var _cloudShowersHeavy: ImageVector? = null

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

public val Icons.Outline.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.414f, 0.587f)
                arcToRelative(2.022f, 2.022f, 0.0f, false, false, -1.941f, -0.513f)
                arcToRelative(16.461f, 16.461f, 0.0f, false, false, -6.479f, 3.983f)
                lineToRelative(-9.476f, 9.475f)
                arcToRelative(14.58f, 14.58f, 0.0f, false, false, -4.376f, -1.522f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.286f, 1.979f)
                arcToRelative(12.632f, 12.632f, 0.0f, false, true, 5.353f, 2.387f)
                lineToRelative(-3.709f, 3.71f)
                lineToRelative(-0.793f, -0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineToRelative(-0.793f, -0.793f)
                lineToRelative(3.709f, -3.71f)
                arcToRelative(12.609f, 12.609f, 0.0f, false, true, 2.387f, 5.354f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.99f, 0.856f)
                arcToRelative(0.881f, 0.881f, 0.0f, false, false, 0.144f, -0.011f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.847f, -1.13f)
                arcToRelative(14.515f, 14.515f, 0.0f, false, false, -1.522f, -4.376f)
                lineToRelative(9.475f, -9.476f)
                arcToRelative(16.52f, 16.52f, 0.0f, false, false, 4.01f, -6.574f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, -0.54f, -1.846f)
                close()
                moveTo(18.529f, 7.592f)
                lineTo(9.362f, 16.76f)
                arcToRelative(11.15f, 11.15f, 0.0f, false, false, -0.988f, -1.134f)
                arcToRelative(11.36f, 11.36f, 0.0f, false, false, -1.133f, -0.988f)
                lineToRelative(9.167f, -9.167f)
                arcToRelative(14.384f, 14.384f, 0.0f, false, true, 5.584f, -3.464f)
                arcToRelative(14.453f, 14.453f, 0.0f, false, true, -3.463f, 5.585f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null

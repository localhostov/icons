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

public val Icons.Outline.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.946f)
                arcTo(6.411f, 6.411f, 0.0f, false, false, 6.065f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                horizontalLineTo(5.485f)
                lineTo(4.472f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.965f)
                lineToRelative(-0.145f, 0.573f)
                lineTo(3.8f, 13.7f)
                arcToRelative(8.37f, 8.37f, 0.0f, false, false, -0.07f, 1.032f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 4.053f, 17.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.93f)
                arcToRelative(8.248f, 8.248f, 0.0f, false, false, 14.14f, 0.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(19.947f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 0.325f, -2.273f)
                arcTo(8.37f, 8.37f, 0.0f, false, false, 20.2f, 13.7f)
                lineToRelative(-0.175f, -0.7f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.522f)
                lineTo(18.513f, 7.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(6.279f, 6.279f, 0.0f, false, true, -6.272f, -6.273f)
                arcTo(6.188f, 6.188f, 0.0f, false, true, 5.775f, 14.0f)
                lineTo(7.805f, 5.97f)
                arcToRelative(4.448f, 4.448f, 0.0f, false, true, 8.376f, -0.041f)
                lineTo(18.225f, 14.0f)
                arcToRelative(6.188f, 6.188f, 0.0f, false, true, 0.047f, 0.725f)
                arcTo(6.279f, 6.279f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
